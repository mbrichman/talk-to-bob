(ns talk-to-bob.bob-test
  (:require [clojure.test :refer :all]
            [talk-to-bob.bob :refer :all]))

(deftest last-char-test
  (testing "returns the last character of the input string"
    (is (= (last-char "boo!") "!"))))

(deftest is-uppercase-test
 (testing "returns true when contains all uppercase alpha chars"
  (is (= (check-uppercase "BOO") "BOO")))

 (testing "returns false when not all uppercase alpha chars"
  (is (= (check-uppercase "BoO") nil)))

 (testing "returns true when  all uppercase alpha chars with other chars"
  (is (= (check-uppercase "BB4O$P") "BB")))
 )

(deftest bob-response-test
 (testing "Bob says 'Whoa, Chill out!'' when shouting"
  (is (= (bob-response "WATCH OUT!") "Whoa, Chill out!")))

 (testing "Bob says 'Whoa, Chill out!'' when shouting"
  (is (= (bob-response "BOO!") "Whoa, Chill out!")))

 (testing "Bob says 'Whoa, Chill out!'' when shouting"
  (is (= (bob-response "ZOMG THE %^*@#$(*^ ZOMBIES ARE COMING!!11!!1!") "Whoa, Chill out!")))

 (testing "Bob says 'Whoa, Chill out!'' when shouting"
  (is (= (bob-response  "1, 2, 3 GO!") "Whoa, Chill out!")))

 (testing "Bob says 'Whoa, Chill out!'' when shouting"
  (is (= (bob-response  "УХОДИТЬ") "Whoa, Chill out!")))

 (testing "Bob says 'Sure' when asked a question"
  (is (= (bob-response  "Does this cryogenic chamber make me look fat?") "Sure")))

 (testing "Bob says 'Sure' when asked a question"
  (is (= (bob-response  "Sure?") "Sure")))

 (testing "Bob says 'Whatever' to anything else"
  (is (= (bob-response "Tom-ay-to, tom-aaaah-to.") "Whatever")))

 (testing "Bob says 'Whatever' to anything else"
  (is (= (bob-response "This Isn't Shouting!") "Whatever")))

 (testing "Bob says 'Whatever' to anything else"
  (is (= (bob-response "Ending with ? means a question.") "Whatever")))

 (testing "Bob says 'Whatever' to anything else"
  (is (= (bob-response "Let's go make out behind the gym!") "Whatever")))

 (testing "Bob says 'Whatever' to anything else"
  (is (= (bob-response "1,2,3") "Whatever")))

 (testing "Bob says 'Whatever' to anything else"
  (is (= (bob-response "4?") "Sure")))

 (testing "Bob says 'Whatever' to anything else"
  (is (= (bob-response "") "Fine. Be that way.")))
 )
