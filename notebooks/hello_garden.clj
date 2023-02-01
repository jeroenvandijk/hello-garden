^{:nextjournal.clerk/toc true
  :nextjournal.clerk/visibility {:code :hide}}
(ns hello-garden
  (:require [next.jdbc :as jdbc]))

#_(
  ;; TODO add script to generate db from SQL statements here https://github.com/jOOQ/sakila/tree/main/sqlite-sakila-db
   )

;; ## DB

;; Load db from [Sakila](https://www.jooq.org/sakila).

{:nextjournal.clerk/visibility {:result :hide}}

(def sqlite-db {:dbtype "sqlite" :dbname "./hello.db"})
(def ds (jdbc/get-datasource sqlite-db))

{:nextjournal.clerk/visibility {:result :show}}


;; Run a query
(jdbc/execute! ds ["select * from customer"])
