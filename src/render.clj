#!/usr/bin/env bb

(require '[hiccup2.core :as hiccup]
         '[selmer.parser :as selmer]
         '[index])

(def app-html (slurp "resources/app.html"))

(defn render-html [fname body]
  (->>
    (selmer/render app-html
                   {:body (hiccup/html body)})
    (spit fname)))

(render-html "public/index.html" index/body)
