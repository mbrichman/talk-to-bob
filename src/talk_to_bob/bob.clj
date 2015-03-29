(ns talk-to-bob.bob)

(defn ask []
  (println "What do you want to say to Bob?")(flush))

(defn last-char [input] (str(last input)))

(defn check-uppercase [string]
  (first (re-seq #"\p{Lu}{2,}" string)))

(defn bob-response [input]
  (let [suffix (last-char input) ]
    (cond
      (= suffix "?")
      "Sure"
      (check-uppercase input)
      "Whoa, Chill out!"
      (clojure.string/blank? input)
      "Fine. Be that way."
      :else
      "Whatever"
      )))

(defn ask-bob []
  (ask)
  (let [source (read-line)]
  (println (bob-response source))))

(defn talk-to-bob []
  (while true (ask-bob)))

; (talk-to-bob)
