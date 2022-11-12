import requests
from urllib.parse import quote, quote_plus
from bs4 import BeautifulSoup

url = 'https://en.wikipedia.org/w/index.php' + \
    '?title=List_of_Game_of_Thrones_episodes&oldid=802553687'
r = requests.get(url)
html_content  = r.text

#make a beautiful soup object
html_soup = BeautifulSoup(html_content, 'html.parser')
#print(html_soup)

print(html_soup.find('h1'))
print(html_soup.find('', {'id': 'p-logo'}))
for found in html_soup.find_all(['h1', 'h2']):
    print(found)

'''
general syntax is find(name, attrs, recursive, string, **keywords)
        name can be a string, a list of string ie the tags you want to find
        name can be empty string which will select all elements

        attrs takes a dictionary of attributes and returns all html elements that match those attributes

        The recursive argument is a Boolean and governs the depth of the search. If set to True — the default value, the find and find_all
        methods will look into children, children’s children, and so on... for elements that match your query. 
        
        If it is False, it will only look at direct child elements.
        The string argument is used to perform matching based on the text content of elements.
'''
