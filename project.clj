(defproject ring-timbre "0.1.0"
  :description "Timbre middleware for Ring"
  :url "https://github.com/banzai-inc/ring-timbre"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [ring.middleware.logger "0.5.0" :exclusions [org.slf4j/slf4j-log4j12]]
                 [com.taoensso/timbre "4.1.4"]])
