(ns de.herrnorbert.CaesarPlaysLottery.core)

(defn convert-roman [roman]
  (let [roman-number-table {\I 1
                            \V 5
                            \X 10
                            \L 50
                            \C 100
                            \D 500
                            \M 1000}]
    (->> (partition 2 1 [] roman)
         (map (fn [[a b]]
                (let [av (roman-number-table a 0)
                      bv (roman-number-table b 0)]
                  (if (>= av bv)
                    av
                    (- av)))))
         (reduce +))))
