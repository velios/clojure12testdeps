(ns velios.clojure12testdeps
  (:require
    [clojure.repl.deps :refer [add-lib add-libs sync-deps]]
    [medley.core :as medley]))

(comment
  (medley/find-first number? [1 2 3])
  ;; go to deps and uncomment medley 1.8.1
  ;; and comment 1.7.0
  ;; (add-lib 'dev.weavejester/medley {:mvn/version "1.8.1"})
  ;; (sync-deps)
  ;; now it will be good medley/collate-by added in 1.8.0 should work
  ;;(medley/collate-by identity conj vector [1 2 2 3 3])
  )

(defn greet
  "Callable entry point to the application."
  [data]
  (println (str "Hello, " (or (:name data) "World") "!")))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (greet {:name (first args)}))

