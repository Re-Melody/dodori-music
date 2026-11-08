# Official service artwork

- `spotify.svg`: Spotify 2024 primary green RGB icon from https://developer.spotify.com/documentation/design (logo/icon download).
- `apple_music.svg`: Apple Music color RGB icon from https://marketing.services.apple/apple-music-identity-guidelines (Apple Music Icon download, https://apple.co/am-icon-2020).
- `youtube.png`: red digital icon from https://brand.youtube/youtube-icon/ (Core YouTube icon download).
- `buy_on_itunes.svg`: US/UK Buy on iTunes badge from https://marketing.services.apple/itunes-identity-guidelines.

Artwork geometry, colors, and proportions are preserved. SVG class styles are inlined for Flutter SVG compatibility. Do not recolor or redraw these assets. Previews are streamed only, limited to 30 seconds, with iTunes attribution. Preview audio is never saved to device storage.

The iTunes purchase badge is hidden in the zone actions at the user's request. The current iTunes Search API preview terms still require a linked store badge near previews: https://developer.apple.com/library/archive/documentation/AudioVideo/Conceptual/iTuneSearchAPI/index.html. A preview-provider change is needed to remove that requirement.
