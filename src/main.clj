#!/usr/bin/env bb

(require '[hiccup2.core :refer [html]])

(defn index []
  [:html
   [:head
    [:meta {:charset "UTF-8"}]
    [:meta
     {:content "width=device-width, initial-scale=1.0",
      :name "viewport"}]
    [:link {:rel "stylesheet", :href "/style.css"}]]
   [:body [:h1.text-3xl.font-bold "Hello world!"]]])


(defn write-html [fname page]
  (spit fname (html page)))

(write-html "target/index.html" (index))
