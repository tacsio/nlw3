<h1 align="center">
    <img alt="NextLevelWeek" title="#NextLevelWeek" src=".github/nlw.svg" width="250px" />
</h1>

<h4 align="center"> 
	Next Level Week 3.0 🚀
</h4>

![GitHub repo size](https://img.shields.io/github/repo-size/tacsio/nlw3?color=%237159c1)
![GitHub language count](https://img.shields.io/github/languages/count/tacsio/nlw3?color=%237159c1)
![GitHub top language](https://img.shields.io/github/languages/top/tacsio/nlw3?color=%237159c1)
![GitHub last commit](https://img.shields.io/github/last-commit/tacsio/nlw3?color=%237159c1)
[![GitHub issues](https://img.shields.io/github/issues-raw/tacsio/nlw3?color=%237159c1)](https://github.com/tacsio/nlw3/issues)
[![GitHub contributors](https://img.shields.io/github/contributors/tacsio/nlw3?color=%237159c1)](https://github.com/tacsio/nlw3/graphs/contributors)
[![GitHub commit activity](https://img.shields.io/github/commit-activity/w/tacsio/nlw3?color=%237159c1)](https://github.com/tacsio/nlw3/graphs/commit-activity)
![Maintenance](https://img.shields.io/maintenance/yes/2020?color=%237159c1)

## Figma Layout

[Happy Layout](https://www.notion.so/Layout-Happy-OmniStack-faac4d4d638343fe8bab627125a7557c)

## :zap: Backend 1

- [NodeJs][nodejs] - Node.js® is a JavaScript runtime built on Chrome's V8 JavaScript engine.
- [Typescript][typescript] - TypeScript is an open-source language which builds on JavaScript, one of the world’s most used tools, by adding static type definitions.
- [SQLite][sqlite] - SQLite is a C-language library that implements a small, fast, self-contained, high-reliability, full-featured, SQL database engine.
- [TypeORM][typeorm] - TypeORM is an ORM that can run in NodeJS, Browser, Cordova, PhoneGap, Ionic, React Native, NativeScript, Expo, and Electron platforms and can be used with TypeScript and JavaScript (ES5, ES6, ES7, ES8).
- [Multer][multer] - Node.js middleware for handling multipart/form-data, which is primarily used for uploading files.
- [Yup][yup] - Yup is a JavaScript schema builder for value parsing and validation. Define a schema, transform a value to match, validate the shape of an existing value, or both.

#### :heavy_dollar_sign: Run Scripts

```bash
yarn install
yarn typeorm migration:run
yarn dev
```

## :zap: Backend Quarkus
- [Kotlin][kotlin] - A modern programming language that makes developers happier.
- [Java 11][java11] - JDK 11 is the open-source reference implementation of version 11 of the Java SE Platform as specified by by JSR 384 in the Java Community Process.
- [Quarkus][quarkus] - A Kubernetes Native Java stack tailored for OpenJDK HotSpot and GraalVM, crafted from the best of breed Java libraries and standards.
- [H2 Database][h2] - The Java SQL database. Very fast, open source, JDBC API. Embedded and server modes; in-memory databases

#### :heavy_dollar_sign: Run Scripts

```bash
mvn quarkus:dev
```

## :fireworks: Frontend

- [React][reactjs] - A JavaScript library for building user interfaces.
- [Axios][axios] - Promise based HTTP client for the browser and node.js.
- [React Router Dom][react-router-dom] - Declarative routing for React.
- [React Icons][react-icons] - Include popular icons in your React projects easily with react-icons, which utilizes ES6 imports that allows you to include only the icons that your project is using.
- [Leaflet][leaflet] - An open-source JavaScript library for mobile-friendly interactive maps.
- [React Leaflet][react-leaflet] - ⚛️ React components for 🍃 Leaflet maps.

#### :heavy_dollar_sign: Run Scripts

```bash
yarn install
yarn start
```

![frontend](.github/web.gif)

## :iphone: Mobile

- [React Native][reactnative] - React Native combines the best parts of native development with React, a best-in-class JavaScript library for building user interfaces.
- [React Navigation](https://reactnavigation.org/) - Routing and navigation for your React Native apps.
- [Axios][axios] - Promise based HTTP client for the browser and node.js.
- [Expo][expo] - Expo is an open-source platform for making universal native apps for Android, iOS, and the web with JavaScript and React.
- [Expo Constants][expo-constants] - Provides system information that remains constant throughout the lifetime of your app's install.
- [Expo Font][expo-font] - Allows loading fonts from the web and using them in React Native components. See more detailed usage information in the Using Custom Fonts guide.
- [Expo Location][expo-location] - Allows reading geolocation information from the device. Your app can poll for the current location or subscribe to location update events.

#### :heavy_dollar_sign: Run Scripts

```bash
yarn install
yarn start
# Run on expo
```

<h1 align="center">
    <img alt="NextLevelWeek" title="#NextLevelWeek" src=".github/mobile.png" width="250px" />
</h1>

## :bullettrain_side: Contributing

1. Fork it
2. Create your feature branch (`git checkout -b my-new-feature`)
3. Commit your changes (`git commit -am 'Added some feature'`)
4. Push to the branch (`git push origin my-new-feature`)
5. Create new Pull Request

[rocketseat]: https://github.com/rocketseat
[nodejs]: https://nodejs.org
[java11]: https://openjdk.java.net/projects/jdk/11/
[kotlin]: https://kotlinlang.org/
[typescript]: https://www.typescriptlang.org/
[reactjs]: https://reactjs.org/
[reactnative]: https://reactnative.dev/
[quarkus]: http://quarkus.io/
[axios]: https://github.com/axios/axios
[expo]: https://expo.io/
[expo-constants]: https://docs.expo.io/versions/latest/sdk/constants/
[expo-font]: https://docs.expo.io/versions/latest/sdk/font/
[expo-location]: https://docs.expo.io/versions/latest/sdk/location/
[multer]: https://github.com/expressjs/multer
[celebrate]: https://github.com/arb/celebrate
[yup]: https://github.com/jquense/yup
[knex]: http://knexjs.org/
[react-router-dom]: https://github.com/ReactTraining/react-router#readme
[react-icons]: https://react-icons.github.io/react-icons/
[react-dropzone]: https://react-dropzone.js.org/
[leaflet]: https://leafletjs.com/
[typeorm]: https://typeorm.io/#/
[react-leaflet]: https://react-leaflet.js.org/
[h2]: http://www.h2database.com/html/main.html
[sqlite]: https://www.sqlite.org/index.html
