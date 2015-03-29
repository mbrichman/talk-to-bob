(ns talk-to-bob.bob-test
  (:require [clojure.test :refer :all]
            [talk-to-bob.bob :refer :all]))

(deftest last-char-test
  (testing "returns the last character of the input string"
    (is (= (last-char "boo!") "!"))))

(deftest shouting?-test
  (testing "returns true when uppercase and string ends with !"
    (is (= (shouting? "BOO!") true)))

  (testing "returns false when not uppercase"
   (is (= (shouting? "boo!") false)))

  (testing "returns false when not ending with !"
   (is (= (shouting? "BOO") false)))
  )

(deftest is-uppercase-test
 (testing "returns true when contains all uppercase alpha chars"
  (is (= (is-uppercase "BOO") true)))

 (testing "returns false when not all uppercase alpha chars"
  (is (= (is-uppercase "BoO") false)))

 (testing "returns true when  all uppercase alpha chars with other chars"
  (is (= (is-uppercase "B4O$P") true)))
 )

(deftest bob-response-test
 (testing "Bob says 'Whoa, Chill out!'' when shouting"
  (is (= (bob-response "BOO!") "Whoa, Chill out!")))

 (testing "Bob says 'Sure' when asked a question"
  (is (= (bob-response "BOO?") "Sure")))

 (testing "Bob says 'Whatever' to anything else"
  (is (= (bob-response "BOO") "Whatever")))
 )
