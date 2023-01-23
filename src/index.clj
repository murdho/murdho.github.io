(ns index)

(def nbsp \u00A0)

(def icon-external-link
  [:svg.h-5.w-5 {:fill "currentColor" :viewBox "0 0 20 20" :xmlns "http://www.w3.org/2000/svg"}
   [:path {:d "M11 3a1 1 0 100 2h2.586l-6.293 6.293a1 1 0 101.414 1.414L15 6.414V9a1 1 0 102 0V4a1 1 0 00-1-1h-5z"}]
   [:path {:d "M5 5a2 2 0 00-2 2v8a2 2 0 002 2h8a2 2 0 002-2v-3a1 1 0 10-2 0v3H5V7h3a1 1 0 000-2H5z"}]])

(defn section [{:keys [title text-size]} & body]
  (let [text-size (or text-size "xl")]
    [:div
     [:p.text-2xl title]
     [:div.mt-4
      {:class (str "text-" (name text-size))}
      body]]))

(defn badge [{:keys [color class]} & contents]
  (let [color (name color)
        classes (->> class vector flatten (filter some?) (map name))]
    [:span.inline-flex.items-center.px-3.py-2.rounded-md.font-light.mt-1.cursor-not-allowed.whitespace-nowrap
     {:class (conj classes
                   (str "bg-" color "-100")
                   (str "hover:bg-" color "-200")
                   (str "text-" color "-800")
                   (str "dark:bg-" color "-700")
                   (str "dark:hover:bg-" color "-800")
                   (str "dark:text-" color "-50"))}
     contents]))

(def body
  [:div.grid.grid-cols-1.xl:grid-cols-2
   [:div.pt-5.pl-5.md:pt-20.md:pl-20.lg:pb-20.grid.grid-cols-1.grid-flow-row.gap-20.justify-evenly
    (section
      {:title "hey! 👋"}
      (badge {:color :slate} "#yo"))

    (section
      {:title "my name is"
       :text-size :6xl}
      (badge {:color :violet :class :mr-3} "Murdho")
      (badge {:color :yellow} "Savila"))

    (section
      {:title "living a quiet life in"}
      (badge {:color :sky :class :mr-2} "#helsinki")
      (badge {:color :emerald} "#finland"))

    (section
      {:title "first appeared in"}
      (badge {:color :zinc :class :mr-2} "#tallinn")
      (badge {:color :pink} "#estonia"))

    (section
      {:title "embracing uncertainty with"}
      (badge {:color :red :class :mr-2} "#ruby")
      (badge {:color :orange :class :mr-2} "#rust")
      (badge {:color :lime} "#clojure"))

    (section
      {:title "some code is in"}
      [:a {:href "https://github.com/murdho" :target "_blank"}
       (badge {:color :gray :class :cursor-pointer}
              "github" nbsp icon-external-link)])

    (section
      {:title "professional stuff is in"}
      [:a {:href "https://www.linkedin.com/in/murdho/" :target "_blank"}
       (badge {:color :blue :class [:mr-2 :cursor-pointer]}
              "linkedin" nbsp icon-external-link)]
      (badge {:color :green} "#software-engineer"))

    (section
      {:title "tweets are in"}
      [:a {:href "https://www.twitter.com/0xMURDHO" :target "_blank"}
       (badge {:color :cyan :class :cursor-pointer}
              "twitter" nbsp icon-external-link)])

    (section
      {:title "toots are in"}
      [:a {:rel "me" :href "https://ruby.social/@murdho" :target "_blank"}
       (badge {:color :red :class :cursor-pointer}
              "ruby.social" nbsp icon-external-link)])

    (section
      {:title "more to come soon"}
      (badge {:color :fuchsia :class :mr-2} "#fingers-crossed")
      (badge {:color :amber} "#decade-goals"))

    (section
      {:title "you can reach me at"}
      (badge {:color :teal :class :mr-2} "murdho")
      (badge {:color :indigo :class :mr-2} "@")
      (badge {:color :rose} "murdho.com"))]


   [:div.place-self-end.lg:fixed.lg:bottom-0.lg:right-0.-z-10
    [:img.h-full.w-full {:alt "murdho caricature" :class "max-w-[800px]" :src "/murdho.png"}]]])
