(defn pangkat
  "Pangkat x y"
  [x y]
  (reduce * (repeat y x)))
