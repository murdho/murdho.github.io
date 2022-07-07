#!/usr/bin/env bb

(require '[hiccup2.core :refer [html]])

(defn section [] nil)



(defn index []
  [:html
   [:head
    [:meta {:charset "utf-8"}]
    [:link {:rel "icon" :type "image/png" :href "/favicon-32x32.png" :sizes "32x32"}]
    [:link {:rel "icon" :type "image/png" :href "/favicon-16x16.png" :sizes "16x16"}]
    [:meta {:name "viewport" :content "width=device-width, initial-scale=1"}]
    [:link {:rel "preconnect" :href "https://fonts.bunny.net"}]
    [:link {:href "https://fonts.bunny.net/css?family=JetBrains+Mono&display=swap" :rel "stylesheet"}]
    [:link {:rel "stylesheet", :href "/style.css"}]
    [:title "murdho.com"]]
   [:body
    [:div.grid.grid-cols-1.xl:grid-cols-2
     [:div.pt-5.pl-5.md:pt-20.md:pl-20.lg:pb-20.grid.grid-cols-1.grid-flow-row.gap-20.justify-evenly
      [:div
       [:p.text-2xl "hey! 👋"]
       [:div.text-xl.mt-4
        [:span.inline-flex.items-center.px-3.py-2.rounded-md.font-medium.bg-gray-100.hover:bg-gray-50.text-gray-800.mt-1.cursor-not-allowed.select-none {:on:click "{handleClickYo}"} "#yo"]]]
      [:div
       [:p.text-2xl "my name is"]
       [:div.text-6xl.mt-4
        [:span.inline-flex.items-center.px-3.py-2.rounded-md.font-medium.bg-purple-100.hover:bg-purple-50.text-purple-800.mt-1.cursor-not-allowed "Murdho"]
        [:span.inline-flex.items-center.px-3.py-2.rounded-md.font-medium.bg-yellow-100.hover:bg-yellow-50.text-yellow-800.mt-1.cursor-not-allowed.ml-5 "Savila"]]]
      [:div
       [:p.text-2xl "currently living in"]
       [:div.text-xl.mt-4
        [:span.inline-flex.items-center.px-3.py-2.rounded-md.font-medium.bg-indigo-100.text-indigo-800.hover:bg-indigo-50.mt-1.cursor-not-allowed "#helsinki"]
        [:span.inline-flex.items-center.px-3.py-2.rounded-md.font-medium.bg-purple-100.text-purple-800.hover:bg-purple-50.mt-1.cursor-not-allowed.ml-3 "#finland"]]]
      [:div
       [:p.text-2xl "first appeared in"]
       [:div.text-xl.mt-4
        [:span.inline-flex.items-center.px-3.py-2.rounded-md.font-medium.bg-yellow-100.text-yellow-800.hover:bg-yellow-50.mt-1.cursor-not-allowed "#tallinn"]
        [:span.inline-flex.items-center.px-3.py-2.rounded-md.font-medium.bg-pink-100.text-pink-800.hover:bg-pink-50.mt-1.cursor-not-allowed.ml-3 "#estonia"]]]
      [:div
       [:p.text-2xl "i'm writing code and loving it ❤️"]
       [:div.text-xl.mt-4
        [:span.inline-flex.items-center.px-3.py-2.rounded-md.font-medium.bg-green-100.text-green-800.hover:bg-green-50.mt-1.cursor-not-allowed "#clojure"]
        [:span.inline-flex.items-center.px-3.py-2.rounded-md.font-medium.bg-blue-100.text-blue-800.hover:bg-blue-50.mt-1.cursor-not-allowed.ml-3 "#go"]
        [:span.inline-flex.items-center.px-3.py-2.rounded-md.font-medium.bg-pink-100.text-pink-800.hover:bg-pink-50.mt-1.cursor-not-allowed.ml-3 "#ruby"]
        [:span.inline-flex.items-center.px-3.py-2.rounded-md.font-medium.bg-red-100.text-red-800.hover:bg-red-50.mt-1.cursor-not-allowed.ml-3 "#rust"]]]
      [:div
       [:p.text-2xl "some code is in"]
       [:div.mt-4.text-xl
        [:a {:href "https://github.com/murdho" :target "_blank"}
         [:span.inline-flex.items-center.px-3.py-2.rounded-md.font-medium.bg-gray-100.hover:bg-gray-50.text-gray-800.mt-1.cursor-pointer "github\u00A0"
          [:svg.h-5.w-5 {:fill "currentColor" :viewBox "0 0 20 20" :xmlns "http://www.w3.org/2000/svg"}
           [:path {:d "M11 3a1 1 0 100 2h2.586l-6.293 6.293a1 1 0 101.414 1.414L15 6.414V9a1 1 0 102 0V4a1 1 0 00-1-1h-5z"}]
           [:path {:d "M5 5a2 2 0 00-2 2v8a2 2 0 002 2h8a2 2 0 002-2v-3a1 1 0 10-2 0v3H5V7h3a1 1 0 000-2H5z"}]]]]]]
      [:div
       [:p.text-2xl "professional stuff is in"]
       [:div.mt-4.text-xl
        [:a {:href "https://www.linkedin.com/in/murdho/" :target "_blank"}
         [:span.inline-flex.items-center.px-3.py-2.rounded-md.font-medium.bg-blue-100.hover:bg-blue-50.text-blue-800.mt-1.cursor-pointer "linkedin\u00A0"
          [:svg.h-5.w-5 {:fill "currentColor" :viewBox "0 0 20 20" :xmlns "http://www.w3.org/2000/svg"}
           [:path {:d "M11 3a1 1 0 100 2h2.586l-6.293 6.293a1 1 0 101.414 1.414L15 6.414V9a1 1 0 102 0V4a1 1 0 00-1-1h-5z"}]
           [:path {:d "M5 5a2 2 0 00-2 2v8a2 2 0 002 2h8a2 2 0 002-2v-3a1 1 0 10-2 0v3H5V7h3a1 1 0 000-2H5z"}]]]]
        [:span.inline-flex.items-center.px-3.py-2.rounded-md.font-medium.bg-green-100.text-green-800.hover:bg-green-50.mt-1.cursor-not-allowed.ml-3 "#software-engineer"]]]
      [:div
       [:p.text-2xl "and some random stuff is"]
       [:div.mt-4.text-xl
        [:a {:href "/#" :on:click|preventDefault "{handleClickHere}"}
         [:span.inline-flex.items-center.px-3.py-2.rounded-md.font-medium.bg-pink-100.hover:bg-pink-50.text-pink-800.mt-1.cursor-not-allowed "here"]]
        [:span.inline-flex.items-center.px-3.py-2.rounded-md.font-medium.bg-purple-100.hover:bg-purple-50.text-purple-800.mt-1.cursor-not-allowed.ml-3 "#itiswhatitis"]]]]
     [:div.place-self-end.lg:fixed.lg:bottom-0.lg:right-0.-z-10
      [:img.h-full.w-full {:alt "murdho caricature" :class "max-w-[800px]" :src "/murdho.png"}]]]]])

(defn write-html [fname page]
  (spit fname (html page)))

(write-html "public/index.html" (index))
