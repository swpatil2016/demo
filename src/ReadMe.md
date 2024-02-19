1:- Work of RestTemplate
    1}  Hit the fake store API using url
    2}  Convert java object in JSON
    3}  Convert fake store response(JSON) in java object.

2:- Work of @RequestBody
    Just like we need RestTemplate to convert FakeStore coming data(JSON) into our java object
    (FakeStoreProductDto) similarly @RequestBody convert FrontEnd coming data(JSON) from
    PostMan to our java object(GenericProductDto).
    
    -In CreateProduct method we pass Body of object through PostMan in form of JSON and
    @RequestBody convert it into Java Object(GPDto).

3:- In getAllproduct method product we use array not list, because of type erasure.
    when app run then data type of list erase and RestTemplate will only get list, here is 
    issue we should tell RestTemplate the class in which we want to convert incoming json
    to java object but here only list will present so template in confusion.So we need
    to keep data type at time of running also so that we used the array instead of list.

    -ParameterizTypeReference maintain that type data in list at time of run.so we can
    use list.

4:- Exception handling
    -If we pass some random product id like 123 we saw the nullPointerException and other things
    on PostMan because if we not handle any exception Spring does this on behalf of us and handle 
    the exception. 
    -We can create our own exception and allow things what we want to send Postman(Front end)
    -when we pass this id to fakeStore API it returns some metaData which contains
    error,status which catch by ResponseEntity.