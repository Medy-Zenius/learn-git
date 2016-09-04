(defn pangkat
  "Pangkat x y"
  [x y]
  (reduce * (repeat y x)))

(defn jumlah
  [a &more]
  (let [x (conj more a)]
    (reduce + x)))
