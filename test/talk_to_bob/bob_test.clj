(ns talk-to-bob.bob-test
  (:require [clojure.test :refer :all]
            [talk-to-bob.bob :refer :all]))

(deftest talk-to-bob
  (testing "Ask Bob a question"
    (let [bob-response ()]
    (is (= 1 1)))))
