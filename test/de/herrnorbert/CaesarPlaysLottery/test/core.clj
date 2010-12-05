(ns de.herrnorbert.CaesarPlaysLottery.test.core
  (:use [de.herrnorbert.CaesarPlaysLottery.core] :reload)
  (:use [lazytest.describe :only (describe it testing)]))

(describe convert-roman
  (testing "basic number conversion"
    (it "should convert I to 1"
      (= 1 (convert-roman "I")))
    (it "should convert V to 5"
      (= 5 (convert-roman "V")))
    (it "should convert X to 10"
      (= 10 (convert-roman "X")))
    (it "should convert L to 50"
      (= 50 (convert-roman "L")))
    (it "should convert C to 100"
      (= 100 (convert-roman "C")))
    (it "should convert D to 500"
      (= 500 (convert-roman "D")))
    (it "should convert M to 1000"
      (= 1000 (convert-roman "M"))))
  (testing "additive conversion"
    (it "should convert II to 2"
      (= 2 (convert-roman "II")))
    (it "should convert VI to 6"
      (= 6 (convert-roman "VI")))
    (it "should convert MD to 1500"
      (= 1500 (convert-roman "MD")))
    (it "should convert III to 3"
      (= 3 (convert-roman "III")))
    (it "should convert LXXXV to 85"
      (= 85 (convert-roman "LXXXV"))))
  (testing "subtractive conversion"
    (it "should convert IV to 4"
      (= 4 (convert-roman "IV")))
    (it "should convert IX to 9"
      (= 9 (convert-roman "IX")))
    (it "should convert XL to 40"
      (= 40 (convert-roman "XL")))
    (it "should convert XC to 90"
      (= 90 (convert-roman "XC")))
    (it "should convert CD to 400"
      (= 400 (convert-roman "CD")))
    (it "should convert CM to 900"
      (= 900 (convert-roman "CM"))))
  (testing "some random numbers"
    (it "should convert CCCLXIX to 369"
      (= 369 (convert-roman "CCCLXIX")))
    (it "should convert MMDCCLI to 2751"
      (= 2751 (convert-roman "MMDCCLI")))))

