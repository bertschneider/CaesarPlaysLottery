# CaesarPlaysLottery

A little kata to convert roman numbers into decimal ones.

## Usage

To convert a number use the _convert-roman_ function.

> (convert-roman "MMDCCLI")
> 2751

## Tests

(LazyTest)[https://github.com/stuartsierra/lazytest] is used. It Worked
pretty well so have a look at it.

To run the test watcher use:
java -cp "src:test:classes:lib/*" lazytest.watch src test

### Test Output

At  #<Date Sun Dec 05 19:55:29 CET 2010>
Reloading de.herrnorbert.CaesarPlaysLottery.test.core
....................
Namespaces
    de.herrnorbert.CaesarPlaysLottery.test.core
        #'de.herrnorbert.CaesarPlaysLottery.core/convert-roman
            basic number conversion
                should convert I to 1
                should convert V to 5
                should convert X to 10
                should convert L to 50
                should convert C to 100
                should convert D to 500
                should convert M to 1000
            additive conversion
                should convert II to 2
                should convert VI to 6
                should convert MD to 1500
                should convert III to 3
                should convert LXXXV to 85
            subtractive conversion
                should convert IV to 4
                should convert IX to 9
                should convert XL to 40
                should convert XC to 90
                should convert CD to 400
                should convert CM to 900
            some random numbers
                should convert CCCLXIX to 369
                should convert MMDCCLI to 2751

Ran 20 test cases.
0 failures.

Done.

## License

Copyright (C) 2010 FIXME

Distributed under the Eclipse Public License, the same as Clojure.
