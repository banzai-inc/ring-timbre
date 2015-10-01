(ns ring.middleware.timbre
  (:require [taoensso.timbre :refer [info debug error warn]]
            [ring.middleware.logger :refer [wrap-with-logger]]))

(defn wrap-logger [req]
  (wrap-with-logger
    req
    :info #(info %)
    :debug #(debug %)
    :warn #(warn %)
    :error #(error %)))
