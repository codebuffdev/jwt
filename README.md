# jwt `Java Web Token` Api

Client-Server Authentication :

1. Stateful Authentication :
   It will create one HTTP Session at server side when client is successfully authenticated, one Session-Id is provided and same is sent to client using Response as one Cookie Client Machine, for next request onwards, submits Cookie to server, then server verifies and provides service, until logout.
2. Stateless Authentication :
   It will never create any Memory at server side.
   For a client Authentication one unique number is generated ie called TOKEN.
   Token can be created using Secretkey and even Generated Token can be read using Secretkey.
   This generated token is sent to client machine using Response.
   Client has to send token using Request for 2nd request onwards.
   Token is valid only for a period of time.

\*\* State means - Data of Client stored at Server

Token based Authentication used at -

1. Webservices
2. Horizontal Scaling (microservices)
3. Resource Grant (OAuth)

\*\* Stateless concept, never allocates any memory at server.  
\*\* Good for Distributed application.  
\*\* Token must be validate on every request  
\*\* If Token is shared with others then they can access client data/services.

## json wen token

jwt is pronounced as JAWT.  
JWT is a opensource service (API) that supports generating Token based on client details and secretKey.

Authorization strategies

> Session token -> save the sessionID in the cookie. [reference token]
> JSON web token -> value token

HTTP is stateless.

JWT Structure

1. Header: JWT SPECIFIC INFORMATION
2. Payload: Claims (ClientId, ClientName, providerName, date, expate..)
3. Signature : Base64Encode (Header) + base64Encoder(Payload) <-Secretkey

TOKEN FORMAT :
header.payload.signature  
xxxxxxx.yyyyyyy.zzzzzzzz

### What we gonna do?

1. Generate Token using JWT java api
2. Read & validate Token using JWT java api

JJWT - Java JWT API is a Open source Java API -

dependencies

```xml
    <dependency>
      <groupId>io.jsonwebtoken</groupId>
      <artifactId>jjwt</artifactId>
      <version>0.9.1</version>
    </dependency>
```

```xml
    <dependency>
      <groupId>javax.xml.bind</groupId>
      <artifactId>jaxb-api</artifactId>
      <version>2.3.0</version>
    </dependency>

```
