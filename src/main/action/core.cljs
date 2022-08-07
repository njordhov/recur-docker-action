(ns action.core
  (:require 
   [clojure.tools.cli 
    :refer [parse-opts]]
   [clojure.string :as string]
   [shadow.resource :as rc]))

(defn exit [status msg]
  (println msg)
  (.exit js/process status))

(defn main [& args]
  (println "Hello"))
