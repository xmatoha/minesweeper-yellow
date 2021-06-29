(ns minesweeper-yellow.core)

(defn empty-board [n]
  (vec (repeat n (vec (repeat n 0)))))

(defn spread-mines [board mines-count]
  (loop [board board]
    (let [new-board (assoc-in
                     board
                     [(rand-int (count board)) (rand-int (count (get board 0)))]                      "b")
          new-mines-count (count (filter (fn [e] (= e "b")) (flatten new-board)))]
      (if (=  new-mines-count mines-count) new-board
          (recur new-board)))))

