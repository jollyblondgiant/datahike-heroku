;; emtpy placeholder to make heroku recognize it as a clojure project
;; https://devcenter.heroku.com/articles/clojure-support#activatio
(defproject example-project "0.1.0-SNAPSHOT"
  :dependencies [[org.clojure/clojure "1.10.1"]
                 [ring/ring-jetty-adapter "1.8.2"]
                 [io.replikativ/datahike "0.3.2"]
                 [io.replikativ/datahike-postgres "0.1.0"]]
   :profiles
   {:dev
    {:dependencies [[org.clojure/clojurescript "1.10.773"]
                    [com.bhauman/figwheel-main "0.2.12"]
                    ;; optional but recommended
                    [com.bhauman/rebel-readline-cljs "0.1.4"]]}})
