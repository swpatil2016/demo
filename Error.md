
1:- If we pass wrong input like 'abc' instead of '123' in url then "MethodArgumentTypeMismatchException"
    error come.
        Correct path is:-localhost:8080/products/123
        wrong path is :- localhost:8080/products/abc
    Test this on updateProductById API on postMan and see the error.

2:- If we not injected dependency in productService and hit url will give 
    java.lang.NullPointerException error. To solve this error inject the 
    dependency by @Autowired