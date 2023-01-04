import requests

url = 'https://www.jumia.co.ke/' 
r = requests.get(url) #send a http get request for the url provided
print(r.text)
print(r.status_code) #status code from the server
print(r.headers) #http response headers
print(r.reason) #the textual status code
print(r.request) #object type
print(r.request.headers) #http request headers


#dealing with query
'''
In the case of url with a query, it is easier to include the query in the url
This way the server can easily parse the content and can use this as input in the response message to the request

To properly resolve this, use the urllib.parse functions:

        quote & quote_plus
the former encodes special characters in the path section of urls and encode special characters using percent '%XX' encoding including spaces
the latter  does the same but replaces spaces by plus signs and is generally used to encode query strings

'''

from urllib.parse import quote, quote_plus

raw_string = 'a query with /, spaces and ?&'
print(quote(raw_string))
print(quote_plus(raw_string))


#to properly pass a query in a given url
url = 'http://www.webscrapingfordatascience.com/paramhttp/'
parameters = {
    'query' : 'a query with /, spaces and ?&'
}
r = requests.get(url, params = parameters)
print(r.text)
print(r.url)

#in some cases where the server expects the urls to come unencoded, you need to overide requests


'''
A query string is the portion of a URL where data is passed to a web application and/or back-end database. 
The reason we need query strings is that the HTTP protocol is stateless by design. For a website to be anything 
more than a brochure, you need to maintain state (store data). There are a number of ways to do this: 
On most web servers, you can use something like session state server-side. On the client, you can store via cookies. 
Or in the URL, you can store data via a query string.

On the world wide web, all URLs can be broken down into the protocol, the location of the file (or program) and the query string. 
The protocol you see in a browser is almost always HTTP; the location is the typical form of the hostname and 
filename (for example, www.techopedia.com/somefile.html), and the query string is whatever follows the question mark sign ("?").

For example, in the URL below, the bolded area is the query string that was generated when the term "database" 
was searched on the Techopedia website.

//www.techopedia.com/search.aspx?q=database§ion=all


'''
def calc(a, b, op):
    url= 'http://www.webscrapingfordatascience.com/calchttp/'
    params= {'a': a, 'b': b, 'op': op}
    r = requests.get(url, params= params)
    return r.text

print(calc(4, 6, '*'))
print(calc(4, 6, '/'))

#in the above code, it has a calculator stored in the filename calchttp which has the parameters and performs calculations


url = 'https://en.wikipedia.org/w/index.php' + \
    '?title=List_of_Game_of_Thrones_episodes&oldid=802553687'
r = requests.get(url)
print(r.text)