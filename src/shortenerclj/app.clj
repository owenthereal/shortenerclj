(ns shortenerclj.app
  (:require [ring.adapter.jetty :as jetty]))
  
(defn app
  [request]
  {:status 200
   :body (:url request)})  

