#!/bin/bash

BUILD_DIR="build"
SRC_DIR="."
JUNIT_JAR="../../lib/junit-platform-console-standalone-1.13.0-M3.jar"

# Create the build directory if it doesn't exist
[ -d "$BUILD_DIR" ] || mkdir -p "$BUILD_DIR"

# Compile source and test files
echo "🔨 Compiling Java files..."
javac -d "$BUILD_DIR" -cp "$JUNIT_JAR" \
  "$SRC_DIR/easy/ArithmeticOperations.java" \
  "$SRC_DIR/test/OperationTest.java"

# Run tests
echo "🚀 Running tests..."
java -jar "$JUNIT_JAR" \
  --class-path "$BUILD_DIR" \
  --scan-class-path
