# Gestionnaire de Contacts - Documentation

## Prérequis

Avant d'utiliser ce projet, assurez-vous que :
- Le **JDK 21 ou supérieur**
- Les commandes `javac` et `java` fonctionnent depuis votre terminal.

### Vérification du JDK
Pour vérifier que le JDK est correctement installé, exécutez :
```bash
javac -version
```

### Structure du projet 

```bash
Projetnnuaire/
├── src/
│   ├── contacts/
│   │   ├── Person.java
│   │   └── Directory.java
│   └── app/
│       └── App.java
├── README.md
```

### Instruction à la compilation et exécution 
#### Compilation 
1. Vérifier que vos fichier suivent bien la structure ci dessus.
2. écutez la commande suivante pour compiler le projet:
```bash
javac -d out src/contacts/*.java src/app/App.java
```
- ``-d out``: indique que les fichiers compilés seront placés dans le dossier ``out`` lors de la compilation.

#### Exécution 
1. Lancez l'application avec:
```
java -cp out app.App
```

### Utilisation de l'application 

#### Affichage dans la console
```
=== Gestionnaire de Contacts ===
1. Ajouter un contact
2. Lister les contacts
3. Quitter
```

- **Option 1**: Ajouter un contact en saisissant un nom et un numéro de téléphone.

- **Option 2**: Lister tous les contacts enregistrés.

- **Option 3**: Quitter l'application.

### Exemple console lors de l'exécution :

```bash
=== Gestionnaire de Contacts ===
1. Ajouter un contact
2. Lister les contacts
3. Quitter
Votre choix : 1
Entrez le nom : Alice
Entrez le numéro de téléphone : 1234567890
Contact ajouté avec succès !

=== Gestionnaire de Contacts ===
1. Ajouter un contact
2. Lister les contacts
3. Quitter
Votre choix : 2

Liste des contacts :
1. Nom: Alice, Téléphone: 1234567890
```