(ns minesweeper-yellow.core-test
  (:require [clojure.test :refer :all]
            [minesweeper-yellow.core :refer :all]))
(deftest minesweeper-yellow-tests
  (testing "board creation"
    (testing "given board size n m create board of size n*n"
      (is (= [[0 0 0] [0 0 0] [0 0 0]] (empty-board 3))))))
