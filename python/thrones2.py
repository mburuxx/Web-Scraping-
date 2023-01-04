import requests
from bs4 import BeautifulSoup

url = 'https://en.wikipedia.org/w/index.php' + \
    '?title=List_of_Game_of_Thrones_episodes&oldid=802553687'
r = requests.get(url)
html_content = r.text

soup = BeautifulSoup(html_content, 'html.parser')
first = soup.find('h1')
print (first)

# general syntax is find(name(tags), attrs(tag attributes in a dictionary), recursive(boolean),
# limits(found in find_all), **keyword(use an attribute as a key word))
# access the name attribute to retrieve the tag name
print (first.name)

# contents attribute returns children of the tags as a list
print (first.contents)

print (str(first))

# returns the text inside the tag specified also same as first.get_text()
print (first.text)

# retrieve the attributes
print (first.attrs)

print ('\n----------CITATIONS----------\n')
cites = soup.find_all('cite', class_= 'citation', limit= 5)
# print (cites)
for citation in cites:
	print (citation.text)
	#find the a tag and get the url
	link = citation.find('a')
	print (link.get('href'))
print ()


# you might find a situation you have to navigate multiple tags i.e tag.find('div').find('table').find('thead').find('tr')
# it is ok to use tag.div.table.thread.tr

