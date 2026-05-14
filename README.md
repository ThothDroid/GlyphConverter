[![](https://jitpack.io/v/ThothDroid/GlyphConverter.svg)](https://jitpack.io/#ThothDroid/GlyphConverter)

# Glyph Converter
A library for converting between MdC (Manuel de Codage) and GlyphX (Hieroglpyh XML). Both are used for displaying egyptian hieroglyphs.

*This library is part of the [Egyptian Writer](https://github.com/ThothDroid/Egyptian_Writer) Android App.*

> [!TIP]
> If you want to render Hieroglyphs in Android try the [Egyptian Writer](https://github.com/ThothDroid/Egyptian_Writer) Android App or these libraries: \
> [THOTH](https://github.com/ThothDroid/THOTH) and [MAAT](https://github.com/ThothDroid/MAAT)

## Implementation with jitpack
Add this to your `settings.gradle.kts` at the end of repositories:
```
dependencyResolutionManagement {
  repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
  repositories {
    mavenCentral()
    maven { url = uri("https://jitpack.io") }
  }
}
```
Then add this dependency to your `build.gradle.kts` file:
```
dependencies {
  implementation("com.github.ThothDroid:GlyphConverter:1.7.0")
}
```
> [!NOTE]
> For the implementation for other build systems like `Groovy` see [here](https://jitpack.io/#ThothDroid/GlyphConverter/)

## Implementation with `.jar` file
Download the `GlpyhConverter_versionname.jar` file from this repository, create a `libs` folder in your project directory and paste the file there. Then add this dependency to your `build.gradle.kts` file:
```
dependencies {
  implementation(files("../libs/GlpyhConverter_versionname.jar"))
}
```

> [!IMPORTANT]
> If you renamed the `.jar` file you also have to change the name in the dependencies

## Version Catalog
### 25.10.2025@1.0.0
This is the first release of the GlyphConverter library.
### 07.11.2025@1.5.0
Support for brackets in MdC added. Now you can type in:
```
N17:(i*(p:t)*(t:p)*i):N17
```
### 08.11.2025@1.6.0
Minor bug fixes. Now you can successfully convert this:
```
N17:i*(p:t)*(t:p)*i:N17
```
### 07.12.2025@1.7.0
- updated dependencies
- Custom exception for `glyphX` parsing added:
`GlyphXParserException.java`
- Support for `\n` and `\t` added
- Support for page break and line break added:
  - `<br/>`: `!`
  - `<pbr/>`: `!!`
### latest Version
`07.12.2025@1.7.0`
