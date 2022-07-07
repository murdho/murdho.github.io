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
        class (when class (name class))]
    [:span.inline-flex.items-center.px-3.py-2.rounded-md.font-medium.mt-1.cursor-not-allowed
     {:class (filter identity [(str "bg-" color "-100")
                               (str "hover:bg-" color "-50")
                               (str "text-" color "-800")
                               class])}
     contents]))

(def body
  [:div.grid.grid-cols-1.xl:grid-cols-2
   [:div.pt-5.pl-5.md:pt-20.md:pl-20.lg:pb-20.grid.grid-cols-1.grid-flow-row.gap-20.justify-evenly
    (section
      {:title "hey! 👋"}
      (badge {:color :gray} "#yo"))

    (section
      {:title "my name is"
       :text-size :6xl}
      (badge {:color :purple} "Murdho")
      (badge {:color :yellow :class :ml-5} "Savila"))

    (section
      {:title "currently living in"}
      (badge {:color :indigo} "#helsinki")
      (badge {:color :purple :class :ml-3} "#finland"))

    (section
      {:title "first appeared in"}
      (badge {:color :yellow} "#tallinn")
      (badge {:color :pink :class :ml-3} "#estonia"))

    (section
      {:title "i'm writing code and loving it ❤️"}
      (badge {:color :green} "#clojure")
      (badge {:color :blue :class :ml-3} "#go")
      (badge {:color :pink :class :ml-3} "#ruby")
      (badge {:color :red :class :ml-3} "#rust"))

    (section
      {:title "some code is in"}
      [:a {:href "https://github.com/murdho" :target "_blank"}
       (badge {:color :gray :class :cursor-pointer}
              "github" nbsp icon-external-link)])

    (section
      {:title "professional stuff is in"}
      [:a {:href "https://www.linkedin.com/in/murdho/" :target "_blank"}
       (badge {:color :blue :class :cursor-pointer}
              "linkedin" nbsp icon-external-link)]
      (badge {:color :green :class :ml-3} "#software-engineer"))

    (section
      {:title "and some random stuff is"}
      (badge {:color :pink} "here (not yet)")
      (badge {:color :purple :class :ml-3} "#itiswhatitis"))]

   [:div.place-self-end.lg:fixed.lg:bottom-0.lg:right-0.-z-10
    [:img.h-full.w-full {:alt "murdho caricature" :class "max-w-[800px]" :src "/murdho.png"}]]])
