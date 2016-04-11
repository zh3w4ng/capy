(defproject capy "0.1.0-SNAPSHOT"
  :description "New Ingestion"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [cascalog/cascalog-core "3.0.0"]]
  :javac-options ["-target" "1.7" "-source" "1.7" "-Xlint:-options"]
  :jvm-opts ["-Xms4096m" "-Xmx4096m"]
  :main capy.core
  :target-path "target/%s"
  :aot [capy.core]
  :profiles {:uberjar {:aot :all}
             :provided {:dependencies [[org.apache.hadoop/hadoop-core "1.2.1"]]}
             :dev {:dependencies [[midje "1.8.3"]]
                   :plugins [[lein-midje "3.2"]]}})
