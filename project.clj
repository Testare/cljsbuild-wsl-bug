(defproject hello-world "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :plugins [
    [lein-cljsbuild "1.1.6"]
  ]
  :dependencies [
    [org.clojure/clojure "1.8.0"]
    [org.clojure/clojurescript "1.9.562"]]
  :cljsbuild {
    :builds [{
      :source-paths ["src"]
      :compiler {
        :main hello-world.core
        :output-to "mainBroken.js"
        :target :nodejs
      }
    },{
      :source-paths ["src"]
      :compiler {
        :main hello-world.core
        :output-to "mainGood.js"
        :output-dir "target/my-compiled-output"
        :target :nodejs
      }
    }]
  })
