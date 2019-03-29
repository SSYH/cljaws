(defproject cljaws "0.3.0"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure         "1.10.0"]
                 [clojure-term-colors         "0.1.0"]
                 [org.ini4j/ini4j             "0.5.4"]
                 [com.cognitect.aws/api       "0.8.273"]
                 [com.cognitect.aws/endpoints "1.1.11.507"]
                 [com.cognitect.aws/sts       "697.2.391.0"]
                 [com.cognitect.aws/iam       "697.2.391.0"]
                 [com.cognitect.aws/s3        "697.2.391.0"]
                 [com.cognitect.aws/ec2       "711.2.413.0"]
                 [com.cognitect.aws/cloudformation "697.2.391.0"]
                 [com.cognitect.aws/autoscaling "711.2.410.0"]
                 [com.cognitect.aws/dynamodb  "697.2.391.0"]
                 [org.clojure/java.jdbc       "0.7.9"]
                 [org.xerial/sqlite-jdbc      "3.27.2.1"]]
  :repl-options {:init-ns cljaws.core})