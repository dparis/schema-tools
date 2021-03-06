(ns schema-tools.runner
  (:require [cljs.test :as test]
            [cljs.nodejs :as nodejs]
            schema-tools.core-test
            schema-tools.walk-test))

(nodejs/enable-util-print!)

(defn -main []
  (test/run-all-tests #"^schema-tools.*-test$"))

(set! *main-cli-fn* -main)
