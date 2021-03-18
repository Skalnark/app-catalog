(defproject project-catalog "0.0.1-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]
                 [io.pedestal/pedestal.service "0.4.0"]

                 ;; Remove this line and uncomment one of the next lines to
                 ;; use Immutant or Tomcat instead of Jetty:
                 [io.pedestal/pedestal.jetty "0.4.0"]
                 ;; [io.pedestal/pedestal.immutant "0.4.0"]
                 ;; [io.pedestal/pedestal.tomcat "0.4.0"]
                 [lein-light-nrepl "0.0.18"]

                 [com.novemberain/monger "2.0.0"]
                 [clj-http "1.1.2"]

                [org.clojure/data.xml "0.0.8"]


                 [ch.qos.logback/logback-classic "1.1.2" :exclusions [org.slf4j/slf4j-api]]
                 [org.slf4j/jul-to-slf4j "1.7.7"]
                 [org.slf4j/jcl-over-slf4j "1.7.7"]
                 [org.slf4j/log4j-over-slf4j "1.7.7"]]
  :min-lein-version "2.0.0"
  :resource-paths ["config", "resources"]

  :repl-options {:nrepl-middleware [lighttable.nrepl.handler/lighttable-ops]}


  :profiles {:dev {:aliases {"run-dev" ["trampoline" "run" "-m" "project-catalog.server/run-dev"]}
                   :dependencies [[io.pedestal/pedestal.service-tools "0.4.0"]]}
             :uberjar {:aot [project-catalog.server]}}
  :main ^{:skip-aot true} project-catalog.server)

