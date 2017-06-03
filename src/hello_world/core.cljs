(ns hello-world.core
    (:require [cljs.nodejs :as nodejs]))

(nodejs/enable-util-print!)

(defn -main [& args]
    (println "Hello node!"))

(set! *main-cli-fn* -main)
