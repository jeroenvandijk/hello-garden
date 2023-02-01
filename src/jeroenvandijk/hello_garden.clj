(ns jeroenvandijk.hello-garden
  "FIXME: my new org.corfield.new/scratch project.")

(defn exec
  "Invoke me with clojure -X hello-garden.hello-garden/exec"
  [opts]
  (println "exec with" opts))

(defn -main
  "Invoke me with clojure -M -m hello-garden.hello-garden"
  [& args]
  (println "-main with" args))
