# Low-Level Design (LLD) Concepts and Design Patterns

## Overview

This repository contains examples and implementations of various Low-Level Design (LLD) concepts and design patterns in Java. The goal is to provide practical demonstrations of common design patterns and their usage in real-world scenarios. This includes patterns like Adapter, Decorator, Singleton, Factory, and more.

## Design Patterns Included

1. **Adapter Pattern**
   - **Purpose**: Allows incompatible interfaces to work together by acting as a bridge between them.
   - **Example**: Connecting a device with a `LegacyPort` to a system expecting a `USB` interface.

2. **Decorator Pattern**
   - **Purpose**: Adds responsibilities to objects dynamically without modifying their code.
   - **Example**: Adding various toppings to a pizza without altering the original pizza class.

3. **Singleton Pattern**
   - **Purpose**: Ensures a class has only one instance and provides a global point of access to it.
   - **Example**: Managing a single instance of a configuration manager across the application.

4. **Factory Pattern**
   - **Purpose**: Provides an interface for creating objects without specifying the exact class of object that will be created.
   - **Example**: Creating different types of vehicles (e.g., Car, Bike) through a factory method.

(You can add more patterns and examples as needed.)

## Project Structure

- **src/main/java**
  - `com.example.patterns`: Contains the implementation of various design patterns.
    - `adapter`: Contains the Adapter pattern examples.
    - `decorator`: Contains the Decorator pattern examples.
    - `singleton`: Contains the Singleton pattern examples.
    - `factory`: Contains the Factory pattern examples.

## Setup and Running

1. **Clone the Repository**

   ```bash
   
