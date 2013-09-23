(def fib
  (map first 
    (iterate (fn [[x y]] [y (+ x y)]) [1 2])))

(println
  (reduce + (filter even? (take-while #(< % 4000000) fib))))
