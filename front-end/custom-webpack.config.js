const { ESBuildMinifyPlugin } = require('esbuild-loader');

module.exports = (config) => {
  config.optimization.minimize = true;
  config.optimization.minimizer = [
    new ESBuildMinifyPlugin({
      // options here
    }),
  ];
  return config;
};