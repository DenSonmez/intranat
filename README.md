#Documentation

Dette er min første documentation

## Start af et nyt webprojekt

1. Opret nyt projekt i intelliJ
2. Valg JavaEE projektskabelon
3. Java + Maven

![img.png](img/img.png)

## Arkitektur
Vi anvender en salgs MVC_pattern.

![img_1.png](img1/img_1.png)
- M(odel) - Entiteter og hjælpe-metoder og klasser (Business-logic)
- V(iew) - JSP og frontend (css, bootstrap mm)
- C(ontrol) - Servlets
- Husk ingen kommunikation mellem Model og View. Gå altid igennem controlleren

## Opret Git Repo
```shell
git init
git add
git commit -m "first commit"
git branch -M main
git remote add origin https://github.com/DenSonmez/intranat.git
git push -u origin main
```