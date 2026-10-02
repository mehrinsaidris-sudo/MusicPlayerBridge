# Music Player - Bridge Design Pattern
## Project Description
This project demonstrates the implementation of the Bridge Design Pattern in Java.
The main purpose of this pattern is to separate abstraction from implementation.

## Design Pattern
Pattern used:
Bridge Pattern (Structural Design Pattern)

## Project Structure
src

├── Main.java

├── abstraction

│   ├── MusicPlayer.java
│   ├── BasicPlayer.java
│   └── PremiumPlayer.java


├── implementor

│   └── AudioEngine.java


└── concrete

    ├── MP3Engine.java

    └── SpotifyEngine.java


## How Bridge Works
The bridge is created by the reference:
MusicPlayer → AudioEngine
MusicPlayer does not depend on specific implementations.
It works only with the AudioEngine interface.

## Implementations
MP3Engine:
- Plays local MP3 files

SpotifyEngine:
- Provides music streaming functionality

## How to Run
1. Open the project in IntelliJ IDEA.
2. Run Main.java.

## Clean Code Principles
1. Separation of responsibilities

MusicPlayer manages player logic.
AudioEngine manages playback implementation.

2. Meaningful names

Class names clearly describe their roles.
3. Small focused classes

Each class has one responsibility.
4. No duplicated logic

Different audio systems are separated.
5. Easy extension

New audio engines can be added without changing existing classes.
