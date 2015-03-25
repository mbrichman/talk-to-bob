(ns talk-to-bob.bob)

(defn ask []
  (println "What do you want to say to Bob?")(flush))

(defn last-char [input] (str(last input)))

(defn is-uppercase [string]
  (let [input (apply str (re-seq #"[a-zA-Z]" string))]
    (= input (clojure.string/upper-case input))))

(defn shouting? [input]
  (and (is-uppercase input) (= (last-char input) "!")))

(defn bob-response [input]
  (let [suffix (last-char input) ]
    (cond
      (= suffix "?") (println "Sure")
      (shouting? input) (println "Whoa, Chill out!")
      (> (count input) 0 )(println "Whatever")
      )))

(defn ask-bob []
  (ask)
  (let [source (read-line)]
  (bob-response source)))

(defn talk-to-bob []
  (while true (ask-bob)))

(talk-to-bob)