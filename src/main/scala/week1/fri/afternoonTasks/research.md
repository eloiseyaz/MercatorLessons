### Task a
|      Features       |                Pure Functions                |               Impure Functions              |
|:-------------------:|:--------------------------------------------:|:-------------------------------------------:|
| State Modification  |  	Can't modify the state of the application  |   Can modify the state of the application   |
|     Dependency	     |     Only depends on its input parameters     | Can be dependent on other parts of the code |
|      Testing	       |               Easier	                |                    Harder                   |
    Maintenance	     |                    Easier                    |                    Harder                   |

### Task b
Pure functions are generally best practice as it is useful for creating code which is predictable, testable and maintainable. It makes the code more understandable and easier to debug.\
Sometimes it is necessary to use an impure function. Examples of this are if we need a random element to our code (i.e. simulating a coin flip) or want to interact with the console.

### Task c
All the method functions I wrote in this afternoon task were pure. This is because their outputs only depended on the input parameters. The objects were impure as they depended on what the user inputted to the console.