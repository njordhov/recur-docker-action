(ns action.core
  (:require 
   [clojure.tools.cli 
    :refer [parse-opts]]
   [clojure.string :as string]
   [shadow.resource :as rc]))

(defn exit [status msg]
  (println msg)
  (.exit js/process status))

(def cli-options
  [[nil "--version"]
   ["-h" "--help"]])

(defn main [& args]
  (let [{:keys [arguments options summary errors] :as opts}
        (parse-opts args cli-options)]
    (println "Hello"))
