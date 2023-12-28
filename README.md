# Internationalization i18n Using Spring Boot

Technology Stacks:
1. Java 21
2. Spring Boot 3.2
2. Thymeleaf Template Engine
3. Language support: English & Bangla

Two way we can configure internationalization aka multi-language support using Spring Boot. 

- With using the **?lang=en** appended in url, need to add following 
```
 @Bean
    public LocaleChangeInterceptor localeChangeInterceptor() {
        LocaleChangeInterceptor lci = new LocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(localeChangeInterceptor());

    }
```
- With using js and reload cookie

``` 
@Bean
    public LocaleResolver localeResolver() {
        CookieLocaleResolver clr = new CookieLocaleResolver("lang");
        clr.setDefaultLocale(Locale.US);
        return clr;
    }
    
```
And JS code 

``` 
<script th:inline="javascript">
    function changeLanguage(lang) {
        document.cookie = "lang=" + lang;
        document.location.reload();
    }
</script>
```

## Result
[view.webm](https://github.com/sifulovi/spring-intl/assets/11840131/781ed3df-f8f8-45d1-bb46-57bf06d535dc)
