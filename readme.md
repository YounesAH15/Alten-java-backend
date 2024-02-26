# Configure and run

use java 17 to run this project :     sdk install java 17.0.4.1-tem
run inside Back folder : 
mvn spring-boot:run

# Requests

load products:

Post
url: https://8081-younesah15-altenjavabac-p2vbqpe65hn.ws-eu108.gitpod.io/

content: cf products.json ( only put the array of products )

________

Patch / Post a product

Patch
url: https://8081-younesah15-altenjavabac-p2vbqpe65hn.ws-eu108.gitpod.io/products/{id}

content: json of a product

