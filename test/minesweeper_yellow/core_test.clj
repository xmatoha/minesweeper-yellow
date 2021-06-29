(ns minesweeper-yellow.core-test
  (:require [clojure.test :refer :all]
            [minesweeper-yellow.core :refer :all]))
(deftest minesweeper-yellow-tests
  (testing "board creation"
    (testing "given board size n m create board of size n*n"
      (is (= [[0 0 0] [0 0 0] [0 0 0]] (empty-board 3))))

    (testing "given board of size n and number of mines m, spread mines on board randomly so that there is m mines at the end"
      (is (= 3 (filter (fn [e] (= e "b")) (flatten (spread-mines (empty-board 3) 3))))))))
