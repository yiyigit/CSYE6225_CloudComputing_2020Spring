# csye6225 cloud computing
    About
- cloud computing basics
- cloud Architecture with models like laaS, PaaS, SaaS
- cloud platform practice- AWS based
- fundamental distributed system algorithms, contention, replication
- views on system design

## Assignment1:
 Step 1 - Design the RESTful API first. 
      - Identify the nouns in the API
     - /classes/{courseId}  eg. /classes/csye6225
     - understand the relationship between the objects 
     - And then illustrate the relationship between the Resources
Step 2 - Identify the GET, POST, PUT, or DELETE operations for each API
Step 3 - Implement the APIs in code. 
Step 4 - Deploy using ElasticBeanstalk

## Assignment2:
Step 1 - Code the Data model and appropriately update any urls or resources.
Step 2 - Replace inmemory db. You can remove the reference to the file from your Service class (e.g. from inside your ProfessorService class).

## Assignment3:
making part of microservice to cloud. infrequent operation that doesn't need to be an API.
using api gateway, lambda, step function, dynamodb, cloudWatch
