(ns cljaws.core
  (:require [cljaws.aws-client :as aws-client]
            [cljaws.ec2 :as ec2]))

(def env->region
  {:dev "us-east-1"
   :test "us-east-1"
   :prod "us-east-1"
   :prod-apse2 "ap-southeast-2"
   :prod-apne1 "ap-northeast-1"
   :prod-euw1 "eu-west-1"
   :prod-euc1 "eu-central-1"
   :prod-use1 "us-east-1"
   :prod-use2 "us-east-2"
   :prod-usw1 "us-west-1"
   :prod-usw2 "us-west-2"})

(defn get-region
  "Returns a region based on profile. Profile is being extended here to
  cover different prod accounts."
  [profile]
  (if (clojure.string/starts-with? (name profile) "prod")
    ((keyword profile) env->region)
    "us-east-1"))

(defn get-profile
  "Returns a profile when the profile specifies both an AWS credential
  file profile and an abbreviated region."
  [profile]
  (first (clojure.string/split (name profile) #"-")))

(defn get-ip
  "Returns a list of private IP's given a role."
  ([role] (get-ip role :default "us-east-1"))
  ([role profile] (get-ip role (get-profile profile) (get-region profile)))
  ([role profile region]
   (doseq [ip (ec2/get-ip (ec2/get-by-role role profile region))]
     (println ip))))