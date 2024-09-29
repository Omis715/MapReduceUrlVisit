# Projet MapReduce : Analyse des fichiers de logs web

Projet MapReduce : Analyse des fichiers de logs web.

## Fonctionnalites
- Extraction des URLs des fichiers de logs.
- Traitement distribué des données pour gérer de grands volumes.
- Détection et affichage de la page la plus visitée.


```bash
├── src
│   └── main
│       └── java
│           └── org.example
│                   ├── CustomMap.java        
│                   ├── Main.java
|                   |── ShuffleAndShort.java      
│                   └── Reducer.java 
|           └── ressources
|                   └── data              
|                         └── your_file.log
|
├── README.md           
├── pom.xml            
└── .gitignore 
```


## Example de logs
```arduino
127.0.0.1 - - [28/Sep/2024:06:25:24 +0000] "GET /index.html HTTP/1.1" 200 1043
```
## Output for my example
```bash
Page /contact.html demandees 178 fois.
Page /index.html demandees 189 fois.
Page /about.html demandees 200 fois.
Page /css/style.css demandees 215 fois.
Page /favicon.ico demandees 218 fois.
```