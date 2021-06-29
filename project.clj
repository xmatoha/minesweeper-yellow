(defproject minesweeper-yellow "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.0"]
                 [lambdaisland/kaocha-cloverage "1.0.75"]
                 [clj-kondo "2021.06.01"]
                 ]
  :target-path "target/%s"

  :aliases {"test" ["run" "-m" "kaocha.runner"]
  "lint" ["run" "-m" "clj-kondo.main" "--lint" "src"]  
            "watch" ["run" "-m" "kaocha.runner" "--watch" "--fail-fast"]}

  :profiles {:uberjar {:aot :all}
             :dev {:dependencies [[lambdaisland/kaocha "1.0.829"]]}})
